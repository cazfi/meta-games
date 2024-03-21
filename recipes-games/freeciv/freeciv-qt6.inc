
require freeciv.inc

inherit qt6-paths

EXTRA_OECONF += "\
--with-qtver=qt6 \
--with-qt6-includes=${STAGING_DIR_HOST}${QT6_INSTALL_INCLUDEDIR} \
--with-qt6-libs=${STAGING_DIR_HOST}${QT6_INSTALL_LIBDIR} \
MOCCMD=${STAGING_DIR_NATIVE}${QT6_INSTALL_LIBEXECDIR}/moc \
"
