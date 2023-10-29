package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static java.lang.Integer.parseInt;

public class Application {
    public static void main(String[] args) {

    }

    /**
     * 유저의 차 이름 입력을 받아 유효성을 검사하고 쉼표를 기준으로 나눠 String[]로 리턴
     * @return String[] carNames
     */
    public static String[] validateCarName(){
        String carInput = readLine();
        if (carInput == null || carInput.isEmpty()) {
            throw new IllegalArgumentException();
        }

        String[] carNames = carInput.split(",", -1);

        if (carNames.length == 0) {
            throw new IllegalArgumentException();
        } else if (carNames.length >= 5) {
            throw new IllegalArgumentException();
        }

        for (String name : carNames){
            if (name.trim().isEmpty()){
                throw new IllegalArgumentException();
            }
            if (name.length() > 5){
                throw new IllegalArgumentException();
            }
            if (name.matches("\\d+")){
                throw new IllegalArgumentException();
            }
        }
        return carNames;
    }

    /**
     * 유저의 게임을 시도할 횟수를 입력 받아 유효성을 검사하고 int로 바꿔 리턴
     * @return int tires
     */
    public static int validateAndParseTry(){
        String tryInput = readLine();
        int tries;
        if (tryInput == null || tryInput.isEmpty()) {
            throw new IllegalArgumentException();
        }

        try {
            tries = parseInt(tryInput);
        } catch (Exception e){
            throw new IllegalArgumentException("숫자를 입력하세요");
        }
        return tries;
    }
}
