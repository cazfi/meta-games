DESCRIPTION = "Annihilate the other tanks to earn money, then spend it on bigger and better shields and weapons to wipe out the opposition."
HOMEPAGE = "http://atanks.sourceforge.net/"
SECTION = "games"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bfbc31ee85cf099e77a598c8a66dd124"

DEPENDS = "allegro4"

SRC_URI = "${SOURCEFORGE_MIRROR}/${BPN}/${BPN}/${BPN}-${PV}/${BPN}-${PV}.tar.gz \
"

inherit autotools-brokensep

SRC_URI[md5sum] = "3182d080ea71c3837af57f3651b55025"
SRC_URI[sha256sum] = "32182b2752a77ff362c378fc04b7c51fc15345caa4c8deaad59cc850dad2322e"

FILES_${PN} += "${datadir}"
