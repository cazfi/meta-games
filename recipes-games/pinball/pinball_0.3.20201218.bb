DESCRIPTION = "Emilia Pinball Simulator"
HOMEPAGE = "http://pinball.sf.net/"
SECTION = "games"
LICENSE = "GPLv2 & CC0-1.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f \
    file://debian/copyright;md5=ef0d1a481815636a22c1d73b1233d9c0 \
"

SRC_URI = "git://github.com/adoptware/pinball.git;protocol=https;nobranch=1"
SRCREV = "fdb2fa3ebea8a1c20e1a50a54c5df292d342b531"

S = "${WORKDIR}/git"

DEPENDS += "libsdl libsdl-image libsdl-mixer \
    libx11 \
    virtual/libgl \
    libglu \
    alsa-lib \
    libvorbis \
    tiff \
"

inherit features_check pkgconfig autotools-brokensep

REQUIRED_DISTRO_FEATURES = "opengl x11"

PACKAGECONFIG ??= "sdl sdl-image sdl-mixer"
PACKAGECONFIG[sdl] = "--enable-sdl,--disable-sdl,libsdl"
PACKAGECONFIG[sdl-image] = "--enable-sdl-image,--disable-sdl-image,libsdl-image"
PACKAGECONFIG[sdl-mixer] = "--enable-sdl-mixer,--disable-sdl-mixer,libsdl-mixer"

PACKAGES = "${PN}"
PACKAGES += "${PN}-dev"
PACKAGES += "${PN}-staticdev"
PACKAGES += "${PN}-dbg"
PACKAGES += "${PN}-data"

REMOVE_LIBTOOL_LA = "0"

do_configure_prepend() {
    cd ${S}
    sed -e "s|libtool --version|-libtool --version|g"  -i helper.mk
    ./bootstrap
}

FILES_${PN}-dev = "\
${includedir}/${PN}/* \
${bindir}/${PN}-config \
"

FILES_${PN}-staticdev = "\
${libdir}/${PN}/lib*.a \
"

FILES_${PN}-dbg = "\
${libdir}/${PN}/.debug/libModule*.so* \
"

FILES_${PN} = "\
${libdir}/${PN}/libModule*.so* \
${libdir}/${PN}/libModule*.la* \
${bindir}/${PN} \
"

FILES_${PN}-data = "\
${datadir}/${PN}/* \
${localstatedir}/games/${PN}/*/highscores \
"

RDEPENDS_${PN} += " ${PN}-data"
INSANE_SKIP_${PN} = "dev-so"
