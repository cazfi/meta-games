DESCRIPTION = "Annihilate the other tanks to earn money, then spend it on bigger and better shields and weapons to wipe out the opposition."
HOMEPAGE = "https://atanks.sourceforge.net/"
SECTION = "games"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=bfbc31ee85cf099e77a598c8a66dd124"

DEPENDS = "allegro4"

SRC_URI = "${SOURCEFORGE_MIRROR}/${BPN}/${BPN}/${BPN}-${PV}/${BPN}-${PV}.tar.gz \
"

inherit autotools-brokensep

SRC_URI[sha256sum] = "bc6b1efc9fc7e7624fad1d8352d72e927be0fba2160bb25bb6b8bd6c6370bf43"

FILES:${PN} += "${datadir}"
