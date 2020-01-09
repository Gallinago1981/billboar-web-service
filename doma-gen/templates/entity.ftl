<#if packageName??>
package ${packageName};
</#if>

<#list importNames as importName>
import ${importName};
</#list>
import java.io.Serializable

@Entity(immutable = true)
@Table(<#if showCatalogName && catalogName??>catalog = "${catalogName}"</#if><#if showSchemaName && schemaName??><#if showCatalogName && catalogName??>, </#if>schema = "${schemaName}"</#if><#if showTableName><#if showCatalogName && catalogName?? || showSchemaName && schemaName??>, </#if>name = "${tableName}"</#if>)
data class ${simpleName}Entity(
<#list ownEntityPropertyDescs as property>
    @Column(name = "${property.columnName}") val ${property.name} : ${property.propertyClassSimpleName}<#if property.nullable>?</#if><#sep>,</#sep>
</#list>
)