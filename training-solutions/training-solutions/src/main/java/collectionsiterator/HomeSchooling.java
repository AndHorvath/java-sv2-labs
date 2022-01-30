package collectionsiterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {

    // --- attributes ---------------------------------------------------------

    private List<OnlineLesson> lessons;

    // --- constructors -------------------------------------------------------

    public HomeSchooling() {
        lessons = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<OnlineLesson> getLessons() { return lessons; }

    // --- public methods -----------------------------------------------------

    public void addNewLesson(OnlineLesson lesson) {
        if (isEmptyListOrLastLesson(lesson)) {
            lessons.add(lesson);
            return;
        }
        for (int i = 0; i < lessons.size(); i++) {
            if (lesson.getStartTime().isBefore(lessons.get(i).getStartTime())) {
                lessons.add(i, lesson);
                return;
            }
        }
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        List<OnlineLesson> lessonsWithGivenTitle = new ArrayList<>();
        Iterator<OnlineLesson> iterator = lessons.iterator();
        while (iterator.hasNext()) {
            OnlineLesson lesson = iterator.next();
            if (lesson.getTitle().equals(title)) {
                lessonsWithGivenTitle.add(lesson);
            }
        }
        return lessonsWithGivenTitle;
    }

    public void removeLessons(LocalDateTime startTime) {
        Iterator<OnlineLesson> iterator = lessons.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getStartTime().equals(startTime)) {
                iterator.remove();
            }
        }
    }

    // --- private methods ----------------------------------------------------

    private boolean isEmptyListOrLastLesson(OnlineLesson lesson) {
        return lessons.isEmpty() || isLastLesson(lesson);
    }

    private boolean isLastLesson(OnlineLesson lesson) {
        return !lesson.getStartTime().isBefore(lessons.get(lessons.size() - 1).getStartTime());
    }
}