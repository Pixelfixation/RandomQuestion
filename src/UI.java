import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public class UI {

	protected Shell shlRandomquestion;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			UI window = new UI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlRandomquestion.open();
		shlRandomquestion.layout();
		while (!shlRandomquestion.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlRandomquestion = new Shell();
		shlRandomquestion.setSize(300, 300);
		shlRandomquestion.setText("Random Question");
		shlRandomquestion.setLayout(new BorderLayout(0, 0));
		
		Label photoPane = new Label(shlRandomquestion, SWT.NONE);
		photoPane.setText("Here it is");
		photoPane.setAlignment(SWT.CENTER);
		photoPane.setLayoutData(BorderLayout.CENTER);
		
		Button randomStudentButton = new Button(shlRandomquestion, SWT.NONE);
		randomStudentButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		randomStudentButton.setLayoutData(BorderLayout.SOUTH);
		randomStudentButton.setText("Get Random Student");
		
		Menu menu = new Menu(shlRandomquestion, SWT.BAR);
		shlRandomquestion.setMenuBar(menu);
		
		MenuItem mntmOptions = new MenuItem(menu, SWT.CASCADE);
		mntmOptions.setText("Options");
		
		Menu menu_1 = new Menu(mntmOptions);
		mntmOptions.setMenu(menu_1);
		
		MenuItem mntmDownloadImages = new MenuItem(menu_1, SWT.NONE);
		mntmDownloadImages.setText("Download images");

	}
}
