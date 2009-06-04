package com.quesoconcarne.scripture.java;

import com.quesoconcarne.scripture.Node;

public interface Emitter<T extends Node> {

    void emit(T node, EmitContext context) throws Exception;
    
}
