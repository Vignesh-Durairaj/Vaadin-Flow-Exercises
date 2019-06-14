package com.vikhi.vaadin.main;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("hello")
public class Hello extends VerticalLayout{

	/** Generated Serial Version UID */
	private static final long serialVersionUID = -4422142279983465055L;

	public Hello() {
		TextField textField = new TextField("Your Name here");
		Button greetButton = new Button("Say Hello !");
		Span nameSpan = new Span();
		
		greetButton.addClickListener(event -> {
			String value = textField.getValue();
			nameSpan.setText((value == "" || value == null) ? ("Hello " + textField.getValue() + ". Welcome to Vaadin!") : "");
		});
		
		add(textField, greetButton, nameSpan);
	}
}
