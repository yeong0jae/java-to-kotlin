package section3.inheritance;

public interface JavaFlyable {

    default void act() {
        System.out.println("파닥 파닥");
    }

}
