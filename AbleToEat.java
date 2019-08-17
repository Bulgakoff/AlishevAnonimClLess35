package AlishevAnonimClassLess35;

 interface AbleToEat {
    public void eat();
}

class Test {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println(" Some one eating  ");

            }
        };//объект этого класса создан только на раз , на обно использование
        ableToEat.eat();
    }

}
