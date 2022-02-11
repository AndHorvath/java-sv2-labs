package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exam {

    // --- inner classes ------------------------------------------------------

    public static class ExamResultComparator implements Comparator<ExamResult> {

        @Override
        public int compare(ExamResult examResult, ExamResult other) {
            return Integer.compare(examResult.getResult(), other.getResult());
        }
    }

    // --- attributes ---------------------------------------------------------

    private List<ExamResult> examResults;
    private ExamResultComparator examResultComparator;

    // --- constructors -------------------------------------------------------

    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
        this.examResultComparator = new ExamResultComparator();
    }

    // --- getters and setters ------------------------------------------------

    public List<ExamResult> getExamResults() { return examResults; }

    // --- public methods -----------------------------------------------------

    public List<String> getNamesOfSucceededPeople(int numberOfPlaces) {
        List<String> succeededPeople = new ArrayList<>();
        List<ExamResult> reversedExamResults = getReversedExamResults();
        int places = Math.min(numberOfPlaces, reversedExamResults.size());
        for (ExamResult examResult : reversedExamResults.subList(0, places)) {
            succeededPeople.add(examResult.getName());
        }
        return succeededPeople;
    }

    // --- private methods ----------------------------------------------------

    private List<ExamResult> getReversedExamResults() {
        List<ExamResult> auxExamResults = new ArrayList<>(examResults);
        auxExamResults.sort(examResultComparator);
        Collections.reverse(auxExamResults);
        return auxExamResults;
    }
}