require neverball.inc

inherit allarch

DEPENDS:append = " jpeg-native libpng-native libsdl2-native"

do_compile() {
	oe_runmake CC="${BUILD_CC}" CFLAGS="${BUILD_CFLAGS} -I${STAGING_INCDIR_NATIVE}/SDL2/" LDFLAGS="${BUILD_LDFLAGS} -lpng" mapc sols
}

do_install() {
	install -d -m 755 ${D}${datadir}/neverball
	cp -R --no-dereference --preserve=mode,links ${B}/data ${D}${datadir}/neverball/
}

FILES:${PN}:append = " ${datadir}/neverball"
