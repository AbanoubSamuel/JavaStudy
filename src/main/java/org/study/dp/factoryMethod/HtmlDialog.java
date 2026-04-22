package org.study.dp.factoryMethod;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}