package inlämning2;

public class Mandelbrot {
	public static void main(String[] args) {
		MandelbrotGUI mGUI = new MandelbrotGUI(500);
		Generator g = new Generator();
		boolean render = false;
		while (true) {
			switch (mGUI.getCommand()) {
			case MandelbrotGUI.RENDER:
				mGUI.resetPlane();
				g.render(mGUI);
				render = true;
				break;
			case MandelbrotGUI.RESET:
				mGUI.resetPlane();
				mGUI.clearPlane();
				render = false;
				break;
			case MandelbrotGUI.ZOOM:
				if (render) {
				g.render(mGUI);
				} else {
					mGUI.clearPlane();
				}
				break;
			case MandelbrotGUI.QUIT:
				System.exit(0);
				break;
			}
		}
	}
}
