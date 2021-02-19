package eu.senla.task7;

public class Factory {
    String robotHead;
    String robotBody;
    String [] robotsHead = new String[9];
    String [] robotsBody = new String[9];
    StringBuilder name;

    public Factory () {
        HeadFactory headFactory = new HeadFactory();
        BodyFactory bodyFactory = new BodyFactory();
        robotsHead[0] = headFactory.getHead(Head.KONE);
        robotsHead[1] = headFactory.getHead(Head.CYLINDER);
        robotsHead[2] = headFactory.getHead(Head.SQUAD);
        for (int i =0; i<9; i++) {
            if (robotsHead [i] == null  ) {
                robotsHead [i] = robotsHead [((int) (Math.random()*2))];
            }
        }
        robotsBody[0] = bodyFactory.getBody(Body.ALUMINIY);
        robotsBody[1] = bodyFactory.getBody(Body.STEEL);
        robotsBody[2] = bodyFactory.getBody(Body.WOOD);
        for (int i =0; i<9; i++) {
            if (robotsBody [i] == null  ) {
                robotsBody [i] = robotsBody [((int) (Math.random()*2))];
            }
        }

        robotHead = robotsHead[((int) (Math.random()*9))];
        robotBody = robotsBody[((int) (Math.random()*9))];
        name = getName();
    }
        private StringBuilder getName () {
        StringBuilder stringBuilder = new StringBuilder();
        String letters = new String();
        letters = "QWE2RT14YU5I5O7P8A9S0DFGH4JK3LZ7XC2V4B326N5M";
        for (int i =0; i<6; i++) {
            stringBuilder.append(letters.charAt((int) ((Math.random()*44))));

        }
        return stringBuilder;
        }

    @Override
    public String toString() {
        return "Серийный номер робота " +
                name +
                ", голова у робота '" + robotHead + '\'' +
                ", тело у робота из '" + robotBody + '\'' +
                '}';
    }


    public static class HeadFactory{
        String headStr;

        private String getHead (Head head) {

            switch (head) {
                case KONE:
                    headStr = "Конус";
                    return headStr;
                case SQUAD:
                    headStr = "Квадрат";
                    return headStr;
                case CYLINDER:
                    headStr = "Цилиндр";
                    return headStr;
            }

            return headStr;
        }
    }



    public static class BodyFactory {
        String bodyStr;
        private String getBody (Body body) {
            switch (body) {
                case WOOD:
                    bodyStr = "Дерева";
                    return bodyStr;
                case STEEL:
                    bodyStr = "Стали";
                    return bodyStr;
                case ALUMINIY:
                    bodyStr = "Алюминия";
                    return bodyStr;
            }
            return bodyStr;
        }
    }

}
