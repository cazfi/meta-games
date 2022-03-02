
require freeciv.inc

inherit qmake5_paths

EXTRA_OECONF += "\
--with-qtver=qt5 \
--with-qt5-includes=${STAGING_INCDIR}${QT_DIR_NAME} \
--with-qt5-libs=${STAGING_LIBDIR}${QT_DIR_NAME} \
MOCCMD=${STAGING_BINDIR_NATIVE}${QT_DIR_NAME}/moc \
"
