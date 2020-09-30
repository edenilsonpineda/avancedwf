> NOTE :warning: Antes de ejecutar es necesario cambiar la configuracion de hibernate.cfg.xml con las credenciales y URL de la base de datos ejecutandose localmente. 

### EJEMPLO
```xml
<hibernate-configuration>
  <session-factory>
    <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
    <property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
    <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/29092020_testingdb_first_release?zeroDateTimeBehavior=convertToNull</property>
    <property name="hibernate.connection.username">root</property>
    <property name="hibernate.connection.password">root</property>
  </session-factory>
</hibernate-configuration>
```
