package CarRacing_1113_O.Script;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {

	private JLabel lblCar1; // 자동차
	private JLabel lblCar2;
	private JLabel lblCar3;

	int x1 = 100; // 자동차의 출발 x좌표
	int x2 = 100; // 자동차의 출발 x좌표
	int x3 = 100; // 자동차의 출발 x좌표

	class MyThread extends Thread {
		public void run() {
			for (int i = 0; i < 120; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// 0.1초에 한 번씩 자동차의 x 위치를 변경한다.
				x1 += (int) (Math.random() * 10);
				lblCar1.setBounds(x1, 0, 100, 100);
				x2 += (int) (Math.random() * 10);
				lblCar2.setBounds(x2, 50, 100, 100);
				x3 += (int) (Math.random() * 10);
				lblCar3.setBounds(x3, 100, 100, 100);
			}
		}
	}

	public CarGame() {
		setTitle("CarRace");
		setSize(900, 250); // 윈도우 프레임 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 화면꺼라
		setLayout(null);
		lblCar1 = new JLabel("질풍");
		lblCar1.setIcon(new ImageIcon("car1.gif"));
		lblCar2 = new JLabel("번개");
		lblCar2.setIcon(new ImageIcon("car2.gif"));
		lblCar3 = new JLabel("천마");
		lblCar3.setIcon(new ImageIcon("car3.gif"));
		add(lblCar1);
		add(lblCar2);
		add(lblCar3);
		lblCar1.setBounds(100, 0, 100, 100);
		lblCar2.setBounds(100, 50, 100, 100);
		lblCar3.setBounds(100, 100, 100, 100);
		(new MyThread()).start();
		setVisible(true);

	}
}
