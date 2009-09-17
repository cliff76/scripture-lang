package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.ast.Node;

public interface Emitter<T extends Node> {

    void emit(T node, EmitContext context) throws Exception;
    
}
