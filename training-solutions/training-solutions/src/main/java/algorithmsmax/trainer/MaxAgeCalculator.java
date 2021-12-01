package algorithmsmax.trainer;

import java.util.ArrayList;
import java.util.List;

public class MaxAgeCalculator {

    // --- public methods -----------------------------------------------------

    public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {
        Trainer trainerWithMaxAge = null;
        for (Trainer trainer : trainers) {
            if (trainerWithMaxAge == null || trainer.getAge() >= trainerWithMaxAge.getAge()) {
                trainerWithMaxAge = trainer;
            }
        }
        return trainerWithMaxAge;
    }

    public List<Trainer> getTrainerWithMaxAgeAll(List<Trainer> trainers) {
        List<Trainer> trainerWithMaxAgeAll = new ArrayList<>();
        trainerWithMaxAgeAll.add(null);
        Trainer actualWithMaxAge;
        for (Trainer trainer : trainers) {
            actualWithMaxAge = trainerWithMaxAgeAll.get(trainerWithMaxAgeAll.size() - 1);
            if (actualWithMaxAge == null || trainer.getAge() > actualWithMaxAge.getAge()) {
                updateTrainerList(trainerWithMaxAgeAll, trainer);
            } else if (trainer.getAge() == actualWithMaxAge.getAge()) {
                trainerWithMaxAgeAll.add(trainer);
            }
        }
        return trainerWithMaxAgeAll;
    }

    // --- private methods ----------------------------------------------------

    private void updateTrainerList(List<Trainer> trainers, Trainer trainer) {
        trainers.clear();
        trainers.add(trainer);
    }
}