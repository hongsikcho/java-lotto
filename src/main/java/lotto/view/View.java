package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.Lotto;

import javax.swing.plaf.IconUIResource;
import java.text.DecimalFormat;
import java.util.List;

public class View {
    private static final DecimalFormat decFormat = new DecimalFormat("###,###");
    public static String printUserInputMoney() {
        System.out.println("구입금액을 입력해 주세요.");
        return Console.readLine();
    }

    public static void printUserLotto(List<Lotto> userLotto) {
        System.out.println(userLotto.size() + "개를 구매했습니다.");
        for (Lotto lottoPiece : userLotto) {
            System.out.println(lottoPiece.getNumbers());
        }
    }

    public static String printUserInputWinningNumber() {
        System.out.println("당첨 번호를 입력해 주세요.");
        return Console.readLine();
    }

    public static String printUserInputBonusNumber() {
        System.out.println("보너스 번호를 입력해 주세요.");
        return Console.readLine();
    }

    public static void printWinningResult(List<Integer> result, List<Long> winningMoney) {
        for (int i = 0; i < 4; i++) {
            if (i == 3) {
                System.out.printf("%d개 일치, 보너스 볼 일치 (%s원) - %d개", 5, decFormat.format(winningMoney.get(i + 1)), result.get(i + 1));
                System.out.println();
                System.out.printf("%d개 일치 (%s원) - %d개", i + 3, decFormat.format(winningMoney.get(i)), result.get(i));
                continue;
            }
            System.out.printf("%d개 일치 (%s원) - %d개", i + 3, decFormat.format(winningMoney.get(i)), result.get(i));
            System.out.println();
        }
    }
}
