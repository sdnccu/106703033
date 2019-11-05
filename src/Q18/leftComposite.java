package Q18;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;

public class leftComposite extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public leftComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = new Composite(this, SWT.NONE);
		GridLayout gl_composite = new GridLayout(1, false);
		gl_composite.marginHeight = 12;
		gl_composite.verticalSpacing = 10;
		gl_composite.marginLeft = 10;
		composite.setLayout(gl_composite);
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setText("Next Page");
		new Label(composite, SWT.NONE);
		
		Button btnCheckButton = new Button(composite, SWT.CHECK);
		btnCheckButton.setText("Yes");
		
		Button btnCheckButton_1 = new Button(composite, SWT.CHECK);
		btnCheckButton_1.setText("No");
		
		Button btnCheckButton_2 = new Button(composite, SWT.CHECK);
		btnCheckButton_2.setText("Not sure");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
