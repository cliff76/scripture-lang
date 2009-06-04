package com.quesoconcarne.scripture.java.runtime;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class KeyValueCoding {

    public static ScriptureObject valueForKey(ScriptureObject receiver, String key) {
        if (receiver == null) {
            return null;
        }
        String getterKey = toGetterKey(key);
        Method method = receiver.getMethodForKey(getterKey);
        if (method == null) {
            method = receiver.getMethodForKey(key);
        }
        if (method == null) {
            throw new ScriptureException("The object " + receiver + " does not have a property with key: " + key);
        }
        try {
            final ScriptureObject result = (ScriptureObject)method.invoke(receiver, null);
            return result;
        } catch (IllegalAccessException ex) {
            throw new ScriptureException("Error while getting property '" + key + "' from " + receiver, ex);
        } catch (IllegalArgumentException ex) {
            throw new ScriptureException("Error while getting property '" + key + "' from " + receiver, ex);
        } catch (InvocationTargetException ex) {
            throw new ScriptureException("Error while getting property '" + key + "' from " + receiver, ex);
        }
    }

    private static String toGetterKey(String key) {
        StringBuilder out = new StringBuilder("get");
        out.append(key.substring(0, 1).toUpperCase());
        out.append(key.substring(1));
        return out.toString();
    }

}
