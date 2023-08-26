import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {


    @Test
    public void test() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Films 1");
        manager.addMovie("Films 2");
        manager.addMovie("Films 3");

        String[] actual = manager.findall();
        String[] expected = {"Films 1", "Films 2", "Films 3"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Films 1");
        manager.addMovie("Films 2");
        manager.addMovie("Films 3");
        manager.addMovie("Films 4");
        manager.addMovie("Films 5");

        String[] actual = manager.findall();
        String[] expected = {"Films 1", "Films 2", "Films 3", "Films 4", "Films 5"};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void test3() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Films 1");
        manager.addMovie("Films 2");
        manager.addMovie("Films 3");
        manager.addMovie("Films 4");
        manager.addMovie("Films 5");

        String[] actual = manager.findlast();
        String[] expected = {"Films 5", "Films 4", "Films 3", "Films 2", "Films 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Films 1");
        manager.addMovie("Films 2");
        manager.addMovie("Films 3");
        manager.addMovie("Films 4");
        manager.addMovie("Films 5");
        manager.addMovie("Films 6");
        manager.addMovie("Films 7");

        String[] actual = manager.findall();
        String[] expected = {"Films 1", "Films 2", "Films 3", "Films 4", "Films 5", "Films 6", "Films 7"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Films 1");
        manager.addMovie("Films 2");
        manager.addMovie("Films 3");
        manager.addMovie("Films 4");
        manager.addMovie("Films 5");
        manager.addMovie("Films 6");

        String[] actual = manager.findlast();
        String[] expected = {"Films 6", "Films 5", "Films 4", "Films 3", "Films 2",};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Films 7");
        manager.addMovie("Films 3");

        String[] actual = manager.findlast();
        String[] expected = {"Films 3", "Films 7",};
        Assertions.assertArrayEquals(expected, actual);
    }
}
