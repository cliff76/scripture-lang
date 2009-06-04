package com.quesoconcarne.scripture.java;

import java.util.List;

public class ListUtilities {

    public static String join(List elements, String delimiter) {
        StringBuilder out = new StringBuilder();
        
        if (elements.size() >= 1) {
            out.append(elements.get(0));
        }

        for (int i = 1; i < elements.size(); i++) {
            out.append(delimiter);
            out.append(elements.get(i));
        }
        
        return out.toString();
    }

}
