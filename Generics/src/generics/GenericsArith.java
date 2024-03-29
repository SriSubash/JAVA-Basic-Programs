package generics;

public class GenericsArith{

    public <T> void concat(T a,T b)
    {
        System.out.println("Concatenation"+a+b);
    }
    public<T extends Number> T add(T a,T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        }
        return null;
    }

    public<T extends Number> T subtract(T a,T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() - b.floatValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        }
        return null;
    }

    public<T extends Number> T multiply(T a,T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        }
        return null;
    }

    public<T extends Number> T divide(T a,T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() / b.floatValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        }
        return null;
    }

    public static void main(String[] args) {
        GenericsArith intOps = new GenericsArith();
        System.out.println("Addition: " + intOps.add(10,20));
        System.out.println("Subtraction: " + intOps.subtract(10,20));
        System.out.println("Multiplication: " + intOps.multiply(10,20));
        System.out.println("Division: " + intOps.divide(10,20));

        GenericsArith floatOps = new GenericsArith();
        System.out.println("Addition: " + floatOps.add(10.1f,20.1f));
        System.out.println("Subtraction: " + floatOps.subtract(10.1f,20.1f));
        System.out.println("Multiplication: " + floatOps.multiply(10.1f,20.1f));
        System.out.println("Division: " + floatOps.divide(10.1f,20.1f));
        String a="saaa";
        String b="avxfs";
   
        floatOps.concat(a, b);
    }
}