package com.propolingo.propolinfo.model;

import com.propolingo.propolinfo.views.ViewFactory;

public class Models {

    private static Models model;
    private final ViewFactory viewFactory;

    public Models()
    {
        viewFactory =new ViewFactory();
    }

    public synchronized static Models getInstance()
    {
        if (model==null)
            model=new Models();
        return model;
    }

   public ViewFactory getViewFactory(){
        return viewFactory;
   }
}
