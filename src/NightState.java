/**
 * Created by alexander.feskov on 11/19/2018.
 */
public class NightState extends TimeOfDayState {
    @Override
    public void Handle(Suitcase suitcase) {
        suitcase.setTimeOfDayState(new DayState());
    }
}
