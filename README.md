### LEER
**Antes de ejecutar es necesario cambiar la configuracion de hibernate.cfg.xml con las credenciales y URL de la base de datos ejecutandose localmente.**
> **NOTE**: :warning: Remover las llaves de los parametros

```xml
<hibernate-configuration>
  <session-factory>
    <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
    <property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
    <property name="hibernate.connection.url">{{URL DE MYSQL}}</property>
    <property name="hibernate.connection.username">{{USUARIO}}</property>
    <property name="hibernate.connection.password">{{PASSWORD}}</property>
  </session-factory>
</hibernate-configuration>
```
