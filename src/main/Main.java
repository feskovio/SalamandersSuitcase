package main;

public class Main {
    public static void main(String[] args) {

        LichurkaBeast lichurkaBeast = new LichurkaBeast("Name 1");
        LichurkaBeast lichurkaBeast1 = new LichurkaBeast("Name 2");
        LichurkaBeast lichurkaBeast2 = new LichurkaBeast("Name 3");

        KomuflorBeast komuflorBeast = new KomuflorBeast("Name 4");
        KomuflorBeast komuflorBeast1 = new KomuflorBeast("Name 5");
        KomuflorBeast komuflorBeast2 = new KomuflorBeast("Name 6");

        OkkamBeast okkamBeast = new OkkamBeast("Name 7");
        OkkamBeast okkamBeast1 = new OkkamBeast("Name 8");
        OkkamBeast okkamBeast2 = new OkkamBeast("Name 9");
        OkkamBeast okkamBeast3 = new OkkamBeast("Name 9");

        BaseRoom baseRoom = new KomuflorRoom(new LichurkaRoom(new OkkamRoom()));
        Suitcase suitcase = new Suitcase(baseRoom);

        suitcase.addResident(lichurkaBeast);
        suitcase.addResident(lichurkaBeast1);
        suitcase.addResident(lichurkaBeast2);

        suitcase.addResident(komuflorBeast);
        suitcase.addResident(komuflorBeast1);
        suitcase.addResident(komuflorBeast2);

        suitcase.addResident(okkamBeast);
        suitcase.addResident(okkamBeast1);
        suitcase.addResident(okkamBeast2);
        suitcase.addResident(okkamBeast3);

        suitcase.toggleDayTime();
        suitcase.toggleDayTime();
        suitcase.toggleDayTime();
        suitcase.toggleDayTime();
        suitcase.toggleDayTime();
        suitcase.toggleDayTime();

        suitcase.speak();

        System.out.println(suitcase.getTotalFoodWeight());
        System.out.println(suitcase.getAvgWeight());

        suitcase.callByName("Name 3");
        suitcase.callByName("Name 7");

        suitcase.selfEnter();
        suitcase.selfEnter();
        suitcase.selfEnter();
        suitcase.selfEnter();
        suitcase.selfEnter();
        suitcase.selfEnter();
        suitcase.selfEnter();

        suitcase.speak();
    }
}
