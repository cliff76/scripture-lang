package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.ArithmeticExpression;
import com.quesoconcarne.scripture.Artifact;
import com.quesoconcarne.scripture.AtomicExpression;
import com.quesoconcarne.scripture.BooleanExpression;
import com.quesoconcarne.scripture.Commandment;
import com.quesoconcarne.scripture.ComparativeExpression;
import com.quesoconcarne.scripture.CreateExpression;
import com.quesoconcarne.scripture.Domain;
import com.quesoconcarne.scripture.ExpressionStatement;
import com.quesoconcarne.scripture.IfStatement;
import com.quesoconcarne.scripture.KeypathExpression;
import com.quesoconcarne.scripture.Node;
import com.quesoconcarne.scripture.Order;
import com.quesoconcarne.scripture.PrayStatement;
import com.quesoconcarne.scripture.PrintStatement;
import com.quesoconcarne.scripture.Prophecy;
import com.quesoconcarne.scripture.Program;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * One-to-one factory for a node type.
 */
public class EmitterFactory {

    private static final EmitterFactory INSTANCE = new EmitterFactory();
    private static Map<Class<? extends Node>, Class<? extends Emitter>> emitterMap;

    private EmitterFactory() {}
    public static EmitterFactory getInstance() {
        return INSTANCE;
    }

    public Emitter getEmitterForNode(Node node) {
        Map<Class<? extends Node>, Class<? extends Emitter>> map = getEmitterMap();
        Class<? extends Emitter> emitterClass = map.get(node.getClass());
        if (emitterClass == null) {
            for (Entry<Class<? extends Node>, Class<? extends Emitter>> entry : map.entrySet()) {
                Class<? extends Node> key = entry.getKey();
                if (key.isAssignableFrom(node.getClass())) {
                    emitterClass = entry.getValue();
                }
            }
        }
        if (emitterClass == null) {
            throw new CompilerBugException("No emitter for AST node: " + node);
        }
        try {
            return emitterClass.newInstance();
        } catch (Exception e) {
            throw new CompilerBugException("Could not instantiate " + emitterClass, e);
        }
    }

    private static Map<Class<? extends Node>, Class<? extends Emitter>> getEmitterMap() {
        if (emitterMap == null) {
            Map<Class<? extends Node>, Class<? extends Emitter>> map = new HashMap<Class<? extends Node>, Class<? extends Emitter>>();
            map.put(Artifact.class, ArtifactEmitter.class);
            map.put(ArithmeticExpression.class, ArithmeticExpressionEmitter.class);
            map.put(AtomicExpression.class, AtomicExpressionEmitter.class);
            map.put(BooleanExpression.class, BooleanExpressionEmitter.class);
            map.put(Commandment.class, CommandmentEmitter.class);
            map.put(ComparativeExpression.class, ComparativeExpressionEmitter.class);
            map.put(CreateExpression.class, CreateExpressionEmitter.class);
            map.put(Domain.class, DomainEmitter.class);
            map.put(ExpressionStatement.class, ExpressionStatementEmitter.class);
            map.put(KeypathExpression.class, KeypathExpressionEmitter.class);
            map.put(IfStatement.class, IfStatementEmitter.class);
            map.put(Order.class, OrderEmitter.class);
            map.put(PrayStatement.class, PrayStatementEmitter.class);
            map.put(PrintStatement.class, PrintStatementEmitter.class);
            map.put(Prophecy.class, ProphecyEmitter.class);
            map.put(Program.class, ProgramEmitter.class);
            emitterMap = map;
        }
        return emitterMap;
    }

}
