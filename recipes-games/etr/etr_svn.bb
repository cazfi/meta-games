SUMMARY = "High speed arctic racing game based on Tux Racer."
DESCRIPTION = " "

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3"

SECTION = "games"

PR = "r0"

SRCREV = "261"
SRC_URI = "svn://svn.code.sf.net/p/extremetuxracer/code/;module=trunk"
PV = "0.5+r${SRCREV}"

SRC_URI[md5sum] = "178290b29a776f8f9da5309a2d379596"
SRC_URI[sha256sum] = "b20c0c0d6138e589b359be49546a034ca4f8deeba2c0b99a894333d306d2234b"

DEPENDS = "libsdl libglu"

S = "${WORKDIR}/trunk"

inherit autotools
