SUMMARY = "Chromium B.S.U. is a fast paced, arcade-style, top-scrolling shooter"
HOMEPAGE = "https://chromium-bsu.sourceforge.io/"
LICENSE = "ClArtistic"
LIC_FILES_CHKSUM = "file://COPYING;md5=641fe79d00b9ef7c22fc782fd98cd651"

inherit autotools pkgconfig gettext gtk-icon-cache

SRC_URI = "${SOURCEFORGE_MIRROR}/project/${BPN}/Chromium%20B.S.U.%20source%20code/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "acc28b2b46567e4a2946031005155a43"
SRC_URI[sha256sum] = "a1c141a34d19a59607ae81166a19864eb8c84cf86b155462fed31a6d56e1624a"

# ftgl is in meta-qt5-extra currently
DEPENDS += " \
    fontconfig  \
    ftgl \
    openal-soft \
    freealut \
"

PACKAGECONFIG ??= "sdl"
PACKAGECONFIG[sdl] = "--enable-sdl,--disable-sdl,libsdl libsdl-image"
PACKAGECONFIG[sdl2] = "--enable-sdl2,--disable-sdl2,libsdl2 libsdl2-image"


FILES:${PN} += " \
    ${datatdir}/icons \
"
