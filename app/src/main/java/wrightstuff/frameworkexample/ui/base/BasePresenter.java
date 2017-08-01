package wrightstuff.frameworkexample.ui.base;

/**
 * This is the base interface for MVP presenter component
 */
public interface BasePresenter<T extends BaseView> {

    void bind(T view);

    void unBind();
}
