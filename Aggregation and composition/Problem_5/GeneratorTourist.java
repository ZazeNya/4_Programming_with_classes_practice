package study;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class GeneratorTourist {
    private Tourist[] Tourist;

    public GeneratorTourist(Tourist... touristPackages) {
        this.Tourist = touristPackages;
    }

    @Override
    public String toString() {
        if (this.Tourist != null) {
            StringBuilder tpSet = new StringBuilder();
            for (Tourist tp : Tourist) {
                tpSet.append(tp.toString() + ";\n");
            }
            return tpSet.toString();
        } else {
            return "Список туристических путевок пуст.";
        }
    }

    //вывод в консоль списка путевок отсортированных по country
    public void printSortedByCountry() {
        sortedByCountry();
        System.out.println("Туристические путевки отсортированы по стране назначения:\n" + toString());
    }

    //вывод в консоль списка путевок отсортированных по locality
    public void printSortedByLocality() {
        sortedByLocality();
        System.out.println("Туристические путевки отсортированы по населенному пункту:\n" + toString());
    }

    //вывод в консоль списка путевок отсортированных по type
    public void printSortedByType() {
        sortedByType();
        System.out.println("Туристические путевки отсортированы по типу путевки:\n" + toString());
    }

    //вывод в консоль списка путевок отсортированных по transport
    public void printSortedByTransport() {
        sortedByTransport();
        System.out.println("Туристические путевки отсортированы по виду транспорта:\n" + toString());
    }

    //вывод в консоль списка путевок отсортированных по nutrition
    public void printSortedByNutrition() {
        sortedByNutrition();
        System.out.println("Туристические путевки отсортированы по виду питания:\n" + toString());
    }

    //вывод в консоль списка путевок отсортированных по nutrition
    public void printSortedByNumberDays() {
        sortedByNumberDays();
        System.out.println("Туристические путевки отсортированы по количеству дней:\n" + toString());
    }

    //Сортировка страна->пункт назначения->тип->транспорт->питание->количество дней
    public Tourist[] sortedByCountry() {
        Comparator<Tourist> tpComparator = new CountryComparator().thenComparing(new LocalityComparator()
                .thenComparing(new TypeComparator().thenComparing(new TransportComparator()
                        .thenComparing(new NutritionComparator().thenComparing(new NumberDaysComparator())))));
        Arrays.sort(this.Tourist, tpComparator);
        return this.Tourist;
    }

    //Сортировка: пункт назначения->страна->тип->транспорт->питание->количество дней
    public Tourist[] sortedByLocality() {
        Comparator<Tourist> tpComparator = new LocalityComparator().thenComparing(new CountryComparator()
                .thenComparing(new TypeComparator().thenComparing(new TransportComparator()
                        .thenComparing(new NutritionComparator().thenComparing(new NumberDaysComparator())))));
        Arrays.sort(this.Tourist, tpComparator);
        return this.Tourist;
    }

    //Сортировка: тип->страна->пункт назначения->транспорт->питание->количество дней
    public Tourist[] sortedByType() {
        Comparator<Tourist> tpComparator = new TypeComparator().thenComparing(new CountryComparator()
                .thenComparing(new LocalityComparator().thenComparing(new TransportComparator()
                        .thenComparing(new NutritionComparator().thenComparing(new NumberDaysComparator())))));
        Arrays.sort(this.Tourist, tpComparator);
        return this.Tourist;
    }

    //Сортировка транспорт->страна->пункт назначения->тип->питание->количество дней
    public Tourist[] sortedByTransport() {
        Comparator<Tourist> tpComparator = new TransportComparator().thenComparing(new CountryComparator()
                .thenComparing(new LocalityComparator().thenComparing(new TypeComparator()
                        .thenComparing(new NutritionComparator().thenComparing(new NumberDaysComparator())))));
        Arrays.sort(this.Tourist, tpComparator);
        return this.Tourist;
    }

    //Сортировка питание->страна->пункт назначения->тип->транспорт->количество дней
    public Tourist[] sortedByNutrition() {
        Comparator<Tourist> tpComparator = new NutritionComparator().thenComparing(new CountryComparator()
                .thenComparing(new LocalityComparator().thenComparing(new TypeComparator()
                        .thenComparing(new TransportComparator().thenComparing(new NumberDaysComparator())))));
        Arrays.sort(this.Tourist, tpComparator);
        return this.Tourist;
    }

    //Сортировка количество дней->страна->пункт назначения->тип->транспорт->питание
    public Tourist[] sortedByNumberDays() {
        Comparator<Tourist> tpComparator = new NumberDaysComparator().thenComparing(new CountryComparator()
                .thenComparing(new LocalityComparator().thenComparing(new TypeComparator()
                        .thenComparing(new TransportComparator().thenComparing(new NutritionComparator())))));
        Arrays.sort(this.Tourist, tpComparator);
        return this.Tourist;
    }

    //Поиск и сортировка путевки по стране назначения
    public void searchByCountry(String country) {
        sortedByCountry();
        System.out.println("Список туристических путевок для страны назначения '" + country + "':");
        boolean search = true;
        for (Tourist tp : Tourist) {
            if (country.equalsIgnoreCase(tp.getCountry())) {
                search = false;
                System.out.println(tp.toString());
            }
        }
        if (search) {
            System.out.println("Туристические путевки в страну назначения '" + country + "' не найдены.");
        }
    }

    //Поиск и сортировка путевки по пункту назначения
    public void searchByLocality(String locality) {
        sortedByLocality();
        System.out.println("Список туристических путевок для населенного пункта '" + locality + "':");
        boolean search = true;
        for (Tourist tp : Tourist) {
            if (locality.equalsIgnoreCase(tp.getLocality())) {
                search = false;
                System.out.println(tp.toString());
            }
        }
        if (search) {
            System.out.println("Туристические путевки в населенный пункт '" + locality + "' не найдены.");
        }
    }

    //Поиск и сортировка путевки по типу путевки
    public List<Tourist> searchByType(String type) {
        sortedByType();
        System.out.println("Список туристических путевок для типа '" + type + "':");
        List<Tourist> listType = new ArrayList<>();
        for (Tourist tp : Tourist) {
            if (type.equalsIgnoreCase(tp.getType())) {
                listType.add(tp);
                System.out.println(tp.toString());
            }
        }
        if (listType.size() == 0) {
            System.out.println("Туристические путевки типа '" + type + "' не найдены.");
        }
        return listType;
    }

    //Поиск и сортировка путевки по виду транспорта
    public List<Tourist> searchByTransport(String transport) {
        sortedByTransport();
        System.out.println("Список туристических путевок для вида транспорта '" + transport + "':");
        List<Tourist> listTransport = new ArrayList<>();
        for (Tourist tp : Tourist) {
            if (transport.equalsIgnoreCase(tp.getTransport())) {
                System.out.println(tp.toString());
                listTransport.add(tp);
            }
        }
        if (listTransport.size() == 0) {
            System.out.println("Туристические путевки для вида транспорта '" + transport + "' не найдены.");
        }
        return listTransport;
    }

    //Поиск и сортировка путевки по наличию питания
    public List<Tourist> searchByNutrition(String nutrition) {
        sortedByNutrition();
        System.out.println("Список туристических путевок по виду питания '" + nutrition + "':");
        List<Tourist> listNutrition = new ArrayList<>();
        for (Tourist tp : Tourist) {
            if (nutrition.equalsIgnoreCase(tp.getNutrition())) {
                System.out.println(tp.toString());
                listNutrition.add(tp);
            }
        }
        if (listNutrition.size() == 0) {
            System.out.println("Туристические путевки по виду питания '" + nutrition + "' не найдены.");
        }
        return listNutrition;
    }

    //Поиск и сортировка путевки по количеству дней
    public void searchByNumberDays(int numberDays) {
        sortedByNumberDays();
        System.out.println("Список туристических путевок на '" + numberDays + "' дней отдыха:");
        boolean test = true;
        for (Tourist tp : Tourist) {
            if (numberDays == tp.getNumberDays()) {
                test = false;
                System.out.println(tp.toString());
            }
        }
        if (test) {
            System.out.println("Туристические путевки на '" + numberDays + "' дней отдыха не найдены.");
        }
    }

    public List<Tourist> searchByNumberDaysInterval(int[] numberDays) {
        sortedByNumberDays();
        System.out.println("Список туристических путевок на [" + numberDays[0] + "-" + numberDays[1] + "] дней отдыха:");
        List<Tourist> listNumberDays = new ArrayList<>();
        for (Tourist tp : Tourist) {
            if (tp.getNumberDays() >= numberDays[0] && tp.getNumberDays() <= numberDays[1]) {
                System.out.println(tp.toString());
                listNumberDays.add(tp);
            }
        }
        if (listNumberDays.size() == 0) {
            System.out.println("Туристические путевки на [" + numberDays[0] + "-" + numberDays[1] + "] дней отдыха не найдены.");
        }
        return listNumberDays;
    }

    //Поиск путевки по типу, транспорту, наличию питания и количеству деней (интервал)
    public List<Tourist> searchByTypeTransportNutritionNumberDays(String type, String transport, String nutrition, int[] numberDays) {
        sortedByCountry();
        System.out.println("Список туристических путевок по следующим параметрам - тип '" + type + "', транспорт '" +
                transport + "', питание '" + nutrition + "', количество дней [" + numberDays[0] + "-" + numberDays[1] + "]:");
        List<Tourist> list = new ArrayList<>();
        for (Tourist tp : Tourist) {
            if (type.equalsIgnoreCase(tp.getType()) && transport.equalsIgnoreCase(tp.getTransport()) &&
                    nutrition.equalsIgnoreCase(tp.getNutrition()) && tp.getNumberDays() >= numberDays[0]
                    && tp.getNumberDays() <= numberDays[1]) {

                System.out.println(tp.toString());
                list.add(tp);
            }
        }
        if (list.size() == 0) {
            System.out.println("Туристические путевки c заданными параметрами не найдены.");
        }
        return list;
    }

    //Поиск по типу отдыха, транспорту
    public List<Tourist> searchByTypeTransport(String type, String transport) {
        sortedByCountry();
        System.out.println("Список туристических путевок по следующим параметрам - тип '" + type + "', транспорт '" +
                transport + "':");
        List<Tourist> list = new ArrayList<>();
        for (Tourist tp : Tourist) {
            if (type.equalsIgnoreCase(tp.getType()) && transport.equalsIgnoreCase(tp.getTransport())) {
                System.out.println(tp.toString());
                list.add(tp);
            }
        }
        if (list.size() == 0) {
            System.out.println("Туристические путевки c заданными параметрами не найдены.");
        }
        return list;
    }

    public Tourist[] getTouristPackages() {
        return Tourist;
    }

    public void setTouristPackages(Tourist... touristPackages) {
        this.Tourist = touristPackages;
    }
}
