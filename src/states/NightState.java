package states;

import main.Suitcase;

public class NightState extends TimeOfDayState {
    @Override
    public void Handle(Suitcase suitcase) {
        suitcase.setTimeOfDayState(new DayState());
    }
}
