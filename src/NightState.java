
public class NightState extends TimeOfDayState {
    @Override
    public void Handle(Suitcase suitcase) {
        suitcase.setTimeOfDayState(new DayState());
    }
}
