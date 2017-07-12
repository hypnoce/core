package org.jboss.weld.tests.unit.ejb.subclass;

public interface IDefault {
   default String defaultMethod(){return "default";}
}
