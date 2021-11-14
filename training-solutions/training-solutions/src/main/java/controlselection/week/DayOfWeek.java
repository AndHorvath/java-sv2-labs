package controlselection.week;

public class DayOfWeek {

    public String getTypeOfDay(String day) {
        String dayString = day.toLowerCase();
        String dayType;

        switch (dayString) {
            case "hétfő":
                dayType = "hét eleje";
                break;
            case "kedd":
            case "szerda":
            case "csütörtök":
                dayType = "hét közepe";
                break;
            case "péntek":
                dayType = "majdnem hétvége";
                break;
            case "szombat":
            case "vasárnap":
                dayType = "hétvége";
                break;
            default:
                return "ismeretlen nap";
        }
        return dayType;
    }
}