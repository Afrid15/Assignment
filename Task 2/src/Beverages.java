abstract class Beverages {
    boolean wantsExtras;

    void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void brew();
    abstract void addCondiments();

    void addExtras() {
        System.out.println("Adding extras");
    }

    void finalTemplateMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras) {
            addExtras();
        }
    }
}

class Tea extends Beverages {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}

class Coffee extends Beverages {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    void addExtras() {
        System.out.println("Adding vanilla syrup");
    }
}
