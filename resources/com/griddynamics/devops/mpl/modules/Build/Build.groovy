/**
 * Common build module
 */

MPLModule('React App Build', CFG)

if( fileExists('openshift') ) {
  MPLModule('Openshift Build', CFG)
}
