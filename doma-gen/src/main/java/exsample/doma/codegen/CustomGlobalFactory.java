package exsample.doma.codegen;

import org.seasar.doma.extension.gen.EntityPropertyClassNameResolver;
import org.seasar.doma.extension.gen.EntityPropertyDescFactory;
import org.seasar.doma.extension.gen.GenerationType;
import org.seasar.doma.extension.gen.GlobalFactory;
import org.seasar.doma.extension.gen.dialect.GenDialect;

public class CustomGlobalFactory extends GlobalFactory {

    @Override
    public EntityPropertyDescFactory createEntityPropertyDescFactory(GenDialect dialect, EntityPropertyClassNameResolver propertyClassNameResolver, String versionColumnNamePattern, GenerationType generationType, Long initialValue, Long allocationSize, boolean showColumnName) {
        return new CustomEntityPropertyDescFactory(dialect, propertyClassNameResolver, versionColumnNamePattern, generationType, initialValue, allocationSize, showColumnName);
    }
}
