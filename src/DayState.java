
public class DayState extends TimeOfDayState {

    @Override
    public void Handle(Suitcase suitcase) {
        suitcase.setTimeOfDayState(new NightState());
    }
}
