package org.study.ultimate.factoryMethod;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}