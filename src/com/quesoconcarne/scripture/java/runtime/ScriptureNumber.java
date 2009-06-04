package com.quesoconcarne.scripture.java.runtime;

public class ScriptureNumber extends ScriptureObject {

    private Number value;

    public ScriptureNumber(Number value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object rhs) {
        if (rhs instanceof ScriptureNumber) {
            ScriptureNumber otherNumber = (ScriptureNumber) rhs;
            if (value instanceof Double) {
                Double doubleValue = (Double) value;
                return doubleValue.compareTo(otherNumber.value.doubleValue());
            }
            Integer integerValue = (Integer) value;
            return integerValue.compareTo(otherNumber.value.intValue());
        }
        return this.hashCode() - rhs.hashCode();
    }

    @Override
    public ScriptureObject add(ScriptureObject rhs) {
        if (rhs instanceof ScriptureNumber) {
            final ScriptureNumber otherNumber = (ScriptureNumber) rhs;
            return evaluate(otherNumber, ArithmeticOperator.ADDITION);
        }
        return super.add(rhs);
    }

    @Override
    public ScriptureObject divide(ScriptureObject rhs) {
        if (rhs instanceof ScriptureNumber) {
            final ScriptureNumber otherNumber = (ScriptureNumber) rhs;
            return evaluate(otherNumber, ArithmeticOperator.DIVISION);
        }
        return super.divide(rhs);
    }

    @Override
    public ScriptureObject modulus(ScriptureObject rhs) {
        if (rhs instanceof ScriptureNumber) {
            final ScriptureNumber otherNumber = (ScriptureNumber) rhs;
            return evaluate(otherNumber, ArithmeticOperator.MODULUS);
        }
        return super.modulus(rhs);
    }

    @Override
    public ScriptureObject multiply(ScriptureObject rhs) {
        if (rhs instanceof ScriptureNumber) {
            final ScriptureNumber otherNumber = (ScriptureNumber) rhs;
            return evaluate(otherNumber, ArithmeticOperator.MULTIPLICATION);
        }
        return super.multiply(rhs);
    }

    @Override
    public ScriptureObject subtract(ScriptureObject rhs) {
        if (rhs instanceof ScriptureNumber) {
            final ScriptureNumber otherNumber = (ScriptureNumber) rhs;
            return evaluate(otherNumber, ArithmeticOperator.SUBTRACTION);
        }
        return super.subtract(rhs);
    }

    private ScriptureNumber evaluate(final ScriptureNumber otherNumber, final ArithmeticOperator operator) {
        final Number otherValue = otherNumber.getValue();
        final Number thisValue = getValue();
        final boolean hasDouble = thisValue instanceof Double || otherValue instanceof Double;
        Number result = null;
        switch (operator) {
            case ADDITION:
                if (hasDouble) {
                    result = thisValue.doubleValue() + otherValue.doubleValue();
                }
                else {
                    result = thisValue.intValue() + otherValue.intValue();
                }
                break;
            case SUBTRACTION:
                if (hasDouble) {
                    result = thisValue.doubleValue() - otherValue.doubleValue();
                }
                else {
                    result = thisValue.intValue() - otherValue.intValue();
                }
                break;
            case MULTIPLICATION:
                if (hasDouble) {
                    result = thisValue.doubleValue() * otherValue.doubleValue();
                }
                else {
                    result = thisValue.intValue() * otherValue.intValue();
                }
                break;
            case DIVISION:
                if (hasDouble) {
                    result = thisValue.doubleValue() / otherValue.doubleValue();
                }
                else {
                    result = thisValue.intValue() / otherValue.intValue();
                }
                break;
            case MODULUS:
                if (hasDouble) {
                    result = thisValue.doubleValue() % otherValue.doubleValue();
                }
                else {
                    result = thisValue.intValue() % otherValue.intValue();
                }
                break;
        }
        return new ScriptureNumber(result);
    }

    private static enum ArithmeticOperator {

        ADDITION,
        SUBTRACTION,
        MULTIPLICATION,
        DIVISION,
        MODULUS;

    }
    
    @Override
    public boolean booleanValue() {
        return value.intValue() != 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ScriptureNumber) {
            ScriptureNumber otherNumber = (ScriptureNumber) obj;
            return value.equals(otherNumber.value);
        }
        return value.equals(obj);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public Number getValue() {
        return value;
    }

}
