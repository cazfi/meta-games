DESCRIPTION = "GNU Pinball table for Emilia Pinball Simulator"
HOMEPAGE = "https://github.com/rzr/pinball-table-gnu"
SECTION = "games"
LICENSE = "GPL-2.0-only & GPL-3.0-only & LAL-1.3 & CC-BY-SA-3.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://debian/copyright;md5=7d2f80a6e11a2648d4657afdb89d05a8 \
"

SRC_URI = "git://github.com/rzr/pinball-table-gnu.git;protocol=https;branch=master"
SRCREV = "7b738e40fd22fce62c6a317e70922ac0eb39f794"

S = "${WORKDIR}/git"

DEPENDS += "pinball \
    libsdl \
"

inherit pkgconfig autotools-brokensep

PACKAGECONFIG ??= "sdl"
PACKAGECONFIG[sdl] = "--enable-sdl,--disable-sdl,libsdl"

PACKAGES = "${PN}"
PACKAGES += "${PN}-dev"
PACKAGES += "${PN}-staticdev"
PACKAGES += "${PN}-dbg"
PACKAGES += "${PN}-data"

REMOVE_LIBTOOL_LA = "0"

do_configure:prepend() {
    cd ${S}
    ./bootstrap
}

FILES:${PN}-dev = "\
${includedir}/${PN}/* \
"

FILES:${PN}-staticdev = "\
${libdir}/pinball/lib*.a \
"

FILES:${PN}-dbg = "\
${libdir}/pinball/.debug/libModule*.so* \
"

FILES:${PN} = "\
${libdir}/pinball/libModule*.so* \
${libdir}/pinball/libModule*.la \
"

FILES:${PN}-data = "\
${datadir}/pinball/*/* \
"

RDEPENDS:${PN} += " pinball"
RDEPENDS:${PN} += " ${PN}-data"
INSANE_SKIP:${PN} = "dev-so"
