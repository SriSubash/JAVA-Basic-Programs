package generics;

public class GenericsSphere<T extends Number> {
    private T radius;

    public GenericsSphere(T radius) {
        this.radius = radius;
    }

    public T getRadius() {
        return radius;
    }

    public double getVolume() {
        double r = radius.doubleValue();
        return (4.0/3.0) * Math.PI * Math.pow(r, 3);
    }

    public double getSurfaceArea() {
        double r = radius.doubleValue();
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static void main(String[] args) {
        GenericsSphere<Integer> sphere1 = new GenericsSphere<>(5);
        System.out.println("Sphere with integer radius 5:");
        System.out.println("Volume: " + sphere1.getVolume());
        System.out.println("Surface Area: " + sphere1.getSurfaceArea());

        GenericsSphere<Float> sphere2 = new GenericsSphere<>(3.5f);
        System.out.println("\nSphere with float radius 3.5:");
        System.out.println("Volume: " + sphere2.getVolume());
        System.out.println("Surface Area: " + sphere2.getSurfaceArea());

        GenericsSphere<Double> sphere3 = new GenericsSphere<>(2.0);
        System.out.println("\nSphere with double radius 2.0:");
        System.out.println("Volume: " + sphere3.getVolume());
        System.out.println("Surface Area: " + sphere3.getSurfaceArea());
    }
}

