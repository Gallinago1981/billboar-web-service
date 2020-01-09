package exsample.doma.codegen;

import org.apache.commons.beanutils.BeanUtils;
import org.seasar.doma.extension.gen.ColumnMeta;
import org.seasar.doma.extension.gen.EntityDesc;
import org.seasar.doma.extension.gen.EntityPropertyClassNameResolver;
import org.seasar.doma.extension.gen.EntityPropertyDesc;
import org.seasar.doma.extension.gen.EntityPropertyDescFactory;
import org.seasar.doma.extension.gen.GenerationType;
import org.seasar.doma.extension.gen.dialect.GenDialect;

import java.lang.reflect.InvocationTargetException;

public class CustomEntityPropertyDescFactory extends EntityPropertyDescFactory {
    public CustomEntityPropertyDescFactory(GenDialect dialect, EntityPropertyClassNameResolver propertyClassNameResolver, String versionColumnNamePattern, GenerationType generationType, Long initialValue, Long allocationSize, boolean showColumnName) {
        super(dialect, propertyClassNameResolver, versionColumnNamePattern, generationType, initialValue, allocationSize, showColumnName);
    }

    @Override
    public EntityPropertyDesc createEntityPropertyDesc(EntityDesc entityDesc, ColumnMeta columnMeta) {
        CustomEntityPropertyDesc customEntityPropertyDesc = new CustomEntityPropertyDesc();

        EntityPropertyDesc entityPropertyDesc = super.createEntityPropertyDesc(entityDesc, columnMeta);
        try {
            BeanUtils.copyProperties(customEntityPropertyDesc, entityPropertyDesc);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        customEntityPropertyDesc.setNullable(columnMeta.isNullable());

        return customEntityPropertyDesc;
    }
}
