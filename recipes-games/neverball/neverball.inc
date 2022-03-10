SUMMARY = "Tilt the floor to roll a ball through an obstacle course before time runs out. Neverball is part puzzle game, part action game, and entirely a test of skill."
SECTION = "graphics"
HOMEPAGE = "https://neverball.org/"

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=200ddba3b50e856bfb681a2b13dfb523"

SRC_URI = "git://github.com/Neverball/neverball.git;branch=master;protocol=https"
SRCREV = "b1617ed0db2c908ff1b96d6a252a85881f0574c0"
PV = "1.6.0+git${SRCPV}"

S = "${WORKDIR}/git"

inherit pkgconfig

EXTRA_OEMAKE:append = " \
	ENABLE_FETCH=0 \
	ENABLE_OPENGLES=1 \
	DATADIR=/usr/share/neverball/data \
	LOCALEDIR=/usr/share/neverball/locale \
	"

do_configure:append() {
	sed -i "s@sdl2-config@pkg-config sdl2@" ${S}/Makefile
	sed -i "s@libpng-config@pkg-config libpng@" ${S}/Makefile
}
