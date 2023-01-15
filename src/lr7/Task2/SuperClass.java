package lr7.Task2;

public class SuperClass {
   /* Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
    базовом классе должен быть метод для присваивания значения полю: без параметров и с
    одним текстовым параметром. Объект суперкласса создается передачей одного текстового
    аргумента конструктору. Доступное только для чтения свойство результатом возвращает
    длину текстовой строки. На основе суперкласса создается подкласс. В подклассе появляется
    дополнительное открытое целочисленное поле. В классе должны быть такие версии метода
    для присваивания значений полям (используется переопределение и перегрузка метода из
            суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
    текстовым и целочисленным параметром. У конструктора подкласса два параметра
           (целочисленный и текстовый) */
    private String str1;

    SuperClass(String strEx){
        this.str1 = strEx;
    }

    public void setValue(String strEx) {
        this.str1 = strEx;
    }
    public void setValue() {}

    public int getStr1() {
        return str1.length();
    }
    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1();
        return superClassNameAndFieldValue ;
    }
}
