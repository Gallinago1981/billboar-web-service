package exsample.doma.codegen;

import org.seasar.doma.extension.gen.EntityPropertyDesc;

public class CustomEntityPropertyDesc extends EntityPropertyDesc {

    protected boolean nullable = false;

    public boolean isNullable() {
        return nullable;
    }

    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }
}
