FREECIV_GUI = "gtk3,qt"

require freeciv.inc

DEFAULT_PREFERENCE = "-1"

BRANCH = "S2_6"
SRCREV="33825"
SRC_URI += "svn://svn.gna.org/svn/freeciv;module=branches/${BRANCH} \
"
PV = "2.6.0-beta0+r${SRCREV}"

EXTRA_OECONF += "\
"

S = "${WORKDIR}/branches/${BRANCH}"

PACKAGES += ""
