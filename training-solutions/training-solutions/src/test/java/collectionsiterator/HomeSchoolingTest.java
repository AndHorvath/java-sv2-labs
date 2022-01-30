package collectionsiterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeSchoolingTest {

    HomeSchooling homeSchooling;
    HomeSchooling other;
    OnlineLesson lessonA;
    OnlineLesson lessonB;
    OnlineLesson lessonC;
    OnlineLesson lessonX;
    OnlineLesson lessonY;
    OnlineLesson lessonZ;

    @BeforeEach
    void setUp() {
        homeSchooling = new HomeSchooling();
        other = new HomeSchooling();
        lessonA = new OnlineLesson("Lesson A", "Teacher A", LocalDateTime.of(2022, 1, 20, 10, 0));
        lessonB = new OnlineLesson("Lesson B", "Teacher B", LocalDateTime.of(2022, 1, 20, 14, 0));
        lessonC = new OnlineLesson("Lesson C", "Teacher C", LocalDateTime.of(2022, 1, 20, 18, 0));
        homeSchooling.addNewLesson(lessonA);
        homeSchooling.addNewLesson(lessonB);
        homeSchooling.addNewLesson(lessonC);
    }

    @Test
    void getLessonsTest() {
        assertEquals(new ArrayList<>(List.of(lessonA, lessonB, lessonC)), homeSchooling.getLessons());
        assertEquals(new ArrayList<>(), other.getLessons());
    }

    @Test
    void addNewLessonTest() {
        lessonX = new OnlineLesson("Lesson X", "Teacher X", LocalDateTime.of(2022, 1, 20, 8, 0));
        homeSchooling.addNewLesson(lessonX);
        assertEquals(
            new ArrayList<>(List.of(lessonX, lessonA, lessonB, lessonC)),
            homeSchooling.getLessons());

        homeSchooling.addNewLesson(lessonX);
        assertEquals(
            new ArrayList<>(List.of(lessonX, lessonX, lessonA, lessonB, lessonC)),
            homeSchooling.getLessons());

        lessonY = new OnlineLesson("Lesson Y", "Teacher Y", LocalDateTime.of(2022, 1, 20, 16, 0));
        homeSchooling.addNewLesson(lessonY);
        assertEquals(
            new ArrayList<>(List.of(lessonX, lessonX, lessonA, lessonB, lessonY, lessonC)),
            homeSchooling.getLessons());

        lessonZ = new OnlineLesson("Lesson Z", "Teacher Z", LocalDateTime.of(2022, 1, 20, 20, 0));
        homeSchooling.addNewLesson(lessonZ);
        assertEquals(
            new ArrayList<>(List.of(lessonX, lessonX, lessonA, lessonB, lessonY, lessonC, lessonZ)),
            homeSchooling.getLessons());

        other.addNewLesson(lessonZ);
        assertEquals(new ArrayList<>(List.of(lessonZ)), other.getLessons());
    }

    @Test
    void getLessonsByTitleTest() {
        lessonX = new OnlineLesson("Lesson B", "Teacher B", LocalDateTime.of(2022, 1, 20, 20, 0));
        homeSchooling.addNewLesson(lessonX);
        assertEquals(
            new ArrayList<>(List.of(lessonB, lessonX)),
            homeSchooling.getLessonsByTitle("Lesson B"));
    }

    @Test
    void removeLessonsTest() {
        lessonX = new OnlineLesson("Lesson X", "Teacher X", LocalDateTime.of(2022, 1, 20, 14, 0));
        homeSchooling.addNewLesson(lessonX);
        assertEquals(
            new ArrayList<>(List.of(lessonA, lessonB, lessonX, lessonC)),
            homeSchooling.getLessons());

        homeSchooling.removeLessons(LocalDateTime.of(2022, 1, 20, 14, 0));
        assertEquals(
            new ArrayList<>(List.of(lessonA, lessonC)),
            homeSchooling.getLessons());
    }
}